# Spring Core Application

## Overview
This is a simple Spring Core application demonstrating dependency injection using an XML configuration file.

## Project Structure
```
project-root/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── mohsin/
│   │   │   │   │   ├── App.java
│   │   │   │   │   ├── Samsung.java
│   │   │   │   │   ├── Iphone.java
│   │   │   │   │   ├── Mobile.java
│   │   ├── resources/
│   │   │   ├── myspring.xml
├── pom.xml (For Maven projects)
├── build.gradle (For Gradle projects)
```

## Dependencies
Ensure you have the following dependencies added to your `pom.xml` (for Maven users) or `build.gradle` (for Gradle users):

### Maven
```xml
<dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>6.2.0</version>
    </dependency>
    
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>3.8.1</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```

### Gradle
```gradle
dependencies {
    implementation 'org.springframework:spring-context:6.2.0'
    testImplementation 'junit:junit:3.8.1'
}
```

## Configuration
Ensure that the `myspring.xml` file is placed in `src/main/resources/`.

### `myspring.xml`
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
        http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="mySamsung" class="com.mohsin.Samsung"/>
    <bean id="myIphone" class="com.mohsin.Iphone"/>
</beans>
```

## Code Implementation

### `App.java`
```java
package com.mohsin;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        try {
            BeanFactory beanFactory = new ClassPathXmlApplicationContext("myspring.xml");
            
            Mobile samsungMobile = (Mobile) beanFactory.getBean("mySamsung");
            samsungMobile.call();
            samsungMobile.mail();
            samsungMobile.massage();
            samsungMobile.snapShot();
            
            Mobile iphoneMobile = (Mobile) beanFactory.getBean("myIphone");
            iphoneMobile.call();
            iphoneMobile.mail();
            iphoneMobile.massage();
            iphoneMobile.snapShot();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```

### `Mobile.java`
```java
package com.mohsin;

public interface Mobile {
    void call();
    void massage();
    void mail();
    void snapShot();
}
```

### `Samsung.java`
```java
package com.mohsin;

public class Samsung implements Mobile {
    public void call() {
        System.out.println("Samsung Calling...");
    }
    public void mail() {
        System.out.println("Samsung Sending Email...");
    }
    public void massage() {
        System.out.println("Samsung Sending Message...");
    }
    public void snapShot() {
        System.out.println("Samsung Taking a Snapshot...");
    }
}
```

### `Iphone.java`
```java
package com.mohsin;

public class Iphone implements Mobile {
    public void call() {
        System.out.println("iPhone Calling...");
    }
    public void mail() {
        System.out.println("iPhone Sending Email...");
    }
    public void massage() {
        System.out.println("iPhone Sending Message...");
    }
    public void snapShot() {
        System.out.println("iPhone Taking a Snapshot...");
    }
}
```

## Common Issue: **IOException Parsing XML Document**
### Cause
- The `myspring.xml` file is missing or not placed in the correct location.
- The path used in `ClassPathXmlApplicationContext("myspring.xml")` is incorrect.

### Solution
1. Ensure `myspring.xml` is inside `src/main/resources/`.
2. Update `ClassPathXmlApplicationContext("myspring.xml")` to reference it correctly.
3. Clean and rebuild the project:
   ```sh
   mvn clean package   # For Maven
   gradle clean build  # For Gradle
   ```

## Running the Application
Use the following command to execute the program:
```sh
mvn exec:java -Dexec.mainClass="com.mohsin.MobileApp"   # For Maven
java -cp target/classes:target/dependency/* com.mohsin.MobileApp  # If manually compiled
```

## License
This project is licensed under the MIT License.

