# GsonFHIR
Gson Serialization Classes for FHIR

Overview
--------

This library contains all 491 FHIR resources and referecned types defined by the [STU3 specification][1] and modeled as Plain Old Java Classes (POJOs) adorned with the appropriate Gson serialization annotations.

This is a convenient library for Java applications working with JSON-based FHIR transaction serialization.

Artifacts
--------

Maven:
```xml
<dependency>
  <groupId>com.xinonix.gsonfhir</groupId>
  <artifactId>gsonfhir</artifactId>
  <version>1.0.1</version>
  <type>pom</type>
</dependency>
```
Gradle:
```groovy
implementation 'com.xinonix.gsonfhir:retrofhir:1.0.1'
```

License
=======

    Copyright 2018 Xinonix Interactive Development, Inc.

    Permission is hereby granted, free of charge, to any person obtaining a copy of this software 
    and associated documentation files (the "Software"), to deal in the Software without restriction, 
    including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, 
    and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, 
    subject to the following conditions:
    
    https://opensource.org/licenses/MIT

    The above copyright notice and this permission notice shall be included in all copies or substantial 
    portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT 
    LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO 
    EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER 
    IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE 
    USE OR OTHER DEALINGS IN THE SOFTWARE.

[1]: https://www.hl7.org/fhir/STU3/index.html
