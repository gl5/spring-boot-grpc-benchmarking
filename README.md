# Spring Boot and gRPC Benchmarking

This project compares the performances of gRPC + Protocol Buffers and REST + JSON.

The comparison is made under certain conditions which we discuss in more detail in the ***Benchmarking*** section below.

Because this experiment is conducted on my local machine, I accept that it just demonstrates their **performances
relative to each other**.

<br/>

# 📝 What I learned?

✏️ Differences **between gRPC and REST**.

✏️ The theory behind **gRPC** and **Protocol Buffer**.

✏️ Setup a simple **gRPC** **Server** and **Client**.

✏️ Make use of **protocol buffers** for **code generation**.

✏️ Integrate **REST APIs** with **Protocol Buffers**.

✏️ Do **benchmarking** with **JMeter**.
<br/>

# 🛠Project Structures

![sample_grpc_project_architecture](https://github.com/recepinanc/spring-boot-grpc-benchmarking/blob/main/sample_grpc_project_architecture.png)

*Single Spring Boot client backed by a GRPC and a Spring Boot Servers.*
<br/>

## sample-client

A Spring Boot project that accepts JSON and Protocol Buffer responses.

**Port:** 5000
<br/>
**Endpoints**

```
// REST

/rest/randomNumbers?count={n} -> Generates {n} random numbers as JSON List
/rest/largeObjects?count={n} -> Generates {n} LargeObjects as Protocol Buffer Object
/rest/largeObjects/json?count={n} -> Generates {n} LargeObjectPOJOs as JSON List

// GRPC

/grpc/randomNumbers?count={n} -> Generates {n} random numbers as Protocol Buffer Object
/grpc/largeObjects?count={n} -> Generates {n} LargeObjects as Protocol Buffer Object
```

- `/rest/**` calls are handled by `sample-springboot-server`
- `/grpc/**` calls are handled by  `sample-grpc-server`

> This project has `sample-grpc-codegen` as dependency in its `pom.xml`.

<br/>

## sample-springboot-server

<br/>
A basic Spring Boot project.

**Port:** 4000
<br/>
**Endpoints**

```
/rest/randomNumbers?count={n} -> Generates {n} random numbers as JSON List
/rest/largeObjects?count={n} -> Generates {n} LargeObjects as Protocol Buffer Object
/rest/largeObjects/json?count={n} -> Generates {n} LargeObjectPOJOs as JSON List
```

<br/>

## sample-grpc-server

<br/>
A basic gRPC Server.

**Port:** 3000
<br/>
**Endpoints**

```
/grpc/randomNumbers?count={n} -> Generates {n} random numbers as Protocol Buffer Object
/grpc/largeObjects?count={n} -> Generates {n} LargeObjects as Protocol Buffer Object
```

<br/>

> This project has `sample-grpc-codegen` as dependency in its `pom.xml`.

<br/>

## sample-grpc-codegen

<br/>
This project is the gist of the gRPC part of the main project.   

The sole purpose of this project is to generate the code based on the given Protobuff file to enable the Server (*
sample-grpc-server*) and the Client (*sample-client*) to make Remote Procedure Calls (RPC) as if the methods they call
are local methods.

For this project, there's a `Sample.proto` and a `LargeObject.proto`  file located under `/src/proto/`.

With the help of plugins, whenever the project is compiled and installed, it generates the required code (hence we call
it ***codegen***) under `/targets/generated-sources` folder.
<br/>

# ⏱ Benchmarking

This benchmarking compares the **performances** of **"gRPC with Protocol Buffers"** against **"REST with JSON"**
during **data transportation**.

<br/>

## Motivation

As we are all witnessing the world moving towards the microservices architecture, gRPC's popularity is on the rise. It
is mainly because it is said to be more performant than REST and its drawbacks are somewhat negligible if we are
planning to use it to design our internal APIs.

So, I wanted to experiment with the implementation of such API, its interaction with other frameworks and, its
performance compared to REST APIs using JMeter.
<br/>

## Setup

Compared to JSON (commonly used in REST APIs as the transfer object), Protocol Buffer offers a great performance
improvement thanks to the way it represents the data during transportation.

Using HTTP/1.1 with JSON is a text-based communication whereas using gRPC and protocol buffers we can make use of HTTP/2
and transport our data in binary format - which helps us increase performance and throughput.


> *Disclaimer: These benchmarking tests ignore the throughput comparisons - for now - but focuses on the difference in the latency.*

To clearly see the effects of using Protocol Buffers, I created a really big object as Proto and Java object, named
it  `LargeObject`, `LargeObjectPOJO` and tested the APIs by fetching instances of this object at different sizes - as it
can be set for each endpoint with the `count` parameter.
<br/>

### Constraints

To be able to focus directly on the performances of data transportation and serialization/deserialization, the
benchmarking setup has the following constraints:

- No Database Connection
- No Business Logic
- No Logging

To remove the effects of generating the LargeObjectResponse (proto object) and LargeObjectPOJO (java object), I call
the *"SetUp Thread Group"* and let the **servers generate the objects** and **cache** them.

This way I can **focus only on the performance aspect of both gRPC and REST approaches during data transportation**.
<br/>

### Test Scenarios

Test Scenarios can be examined under two categories: SetUp and Actual Tests.
<br/>

#### SetUp Thread Group

SetUp Thread Group's main purpose is to trigger all endpoints individually to generate the data that other test
scenarios are going to ask for and let the servers cache the responses before they are asked.
<br/>

#### Actual Test Thread Groups

- The Test Plans scenarios start from **1 user and ramps up to 100 users in 10 seconds** *(Every second 10 requests are
  sent).*
- The same test plan is run for both the **REST** and the **gRPC**.
- There are 6 Different thread groups in total, **3 for REST** and 3 for GRPC.
- Each protocol is tested against 1, 100, 1000 *LargeObjects* to test the performance differences with regards to the
  input size.
- Thread Groups are executed sequentially *(1 Thread Group runs at a time)*.

<br/>

## 📊Results

![collage](https://github.com/recepinanc/spring-boot-grpc-benchmarking/blob/main/benchmarking/response-time-graphs/collage.png)
<br/>
It is clear with higher amounts of data that **gRPC and Protobuff** really out-performs **REST and JSON**!
<br/>
**Key takeaway**

*"REST might be a better choice for public-facing API Designs while gRPC can be used for internal APIs."*

# 📒References

GRPC Official Website: https://grpc.io/

API Design: https://cloud.google.com/apis/design/resources

gRPC vs OpenAPI vs Rest
APIs: https://cloud.google.com/blog/products/api-management/understanding-grpc-openapi-and-rest-and-when-to-use-them

Web API Design Guidelines: https://pages.apigee.com/web-api-design-register.html

gRPC vs OpenAPI: https://medium.com/apis-and-digital-transformation/openapi-and-grpc-side-by-side-b6afb08f75ed

HTTP/2's effect on gRPC: https://dev.to/techschoolguru/http-2-the-secret-weapon-of-grpc-32dk

Great example on how to use
gRPC/Protobuf/JSON: https://www.kabisa.nl/tech/sending-data-to-the-other-side-of-the-world-json-protocol-buffers-rest-grpc/

gRPC in Java: https://blog.j-labs.pl/grpc-in-java

Slack API - Great example of an RPC API Design: https://api.slack.com/methods#conversations
