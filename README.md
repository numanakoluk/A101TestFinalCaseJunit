<div align="center">
 A101WebTestProject
</div>

# **Selenium ile Test Otomasyonu** //Intelij //MVN test
# AllSteps Hepsiburada WithLogin Scenario 
**Tags:chrome**
1. [+] **Çerezler Kabul Edilir.**
2. [+] **Kullanıcı Hepsiburada.com sitesini Ziyaret Eder.**
3. [+] **Kullanıcı Giriş İşlemi Yapılır(Facebook ile giriş).**
4. [+] **Yönlendirmeden sonra anasayfada kullanıcı giriş işleminin yapıldığı doğrulanır.**
5. [+] **Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer..**
6. [+] **Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.**
7. [+] **Seçilen ürünün doğru olarak eklendiği ‘Sepetim’ sayfasında doğrulanır.**
8. [+] **Web'te Yeni adres kaydı oluşturulur.**
9. [+] **Web'te Ödeme ekranına gidilir ve Kart bilgileri girilir.**
10. [+] **Web'te Ödeme ekranına gidildiği doğrulanır.**

# AllSteps Hepsiburada WithNothLogin Scenario 
**Tags:chrome**
1. [+] **Çerezler Kabul Edilir.**
2. [+] **Kullanıcı Hepsiburada.com sitesini Ziyaret Eder.**
3. [+] **Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer..**
4. [+] **Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.**
5. [+] **Seçilen ürünün doğru olarak eklendiği ‘Sepetim’ sayfasında doğrulanır.**
6. [+] **Web'te Yeni adres kaydı oluşturulur.**
7. [+] **Web'te Ödeme ekranına gidilir ve Kart bilgileri girilir.**
8. [+] **Web'te Ödeme ekranına gidildiği doğrulanır.**

# Log4j.xml 

![image](https://user-images.githubusercontent.com/89300182/198569023-481f12dc-c2c8-4cd4-8f85-e606524435cd.png)
 
# POMXML
 
 <?xml version="1.0" encoding="UTF-8"?>

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.example</groupId>
    <artifactId>selam</artifactId>
    <version>1.0-SNAPSHOT</version>

    <name>selam</name>
    <!-- FIXME change it to the project's website -->
    <url>http://www.example.com</url>

    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
        <maven.compiler.source>8</maven.compiler.source>
        <maven.compiler.target>8</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <junit4.version>4.13.2</junit4.version>
        <junit5.version>5.9.0</junit5.version>
        <selenium.version>3.141.59</selenium.version>
        <log4j2.version>2.18.0</log4j2.version>

    </properties>

    <dependencies>
        <!-- https://mvnrepository.com/artifact/junit/junit -->  <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>${junit4.version}</version>
        <scope>test</scope>
    </dependency>
        <!-- https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api -->  <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>${junit5.version}</version>
        <scope>test</scope>
    </dependency>
        <!-- https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-params -->  <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-params</artifactId>
        <version>${junit5.version}</version>
        <scope>test</scope>
    </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>${junit5.version}</version>
        </dependency>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>${selenium.version}</version>
        </dependency>
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-core</artifactId>
            <version>${log4j2.version}</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/log4j/log4j -->
        <dependency>
            <groupId>log4j</groupId>
            <artifactId>log4j</artifactId>
            <version>1.2.17</version>
        </dependency>

        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
            <version>5.9.0</version>
            <scope>compile</scope>
        </dependency>
    </dependencies>
    <build>
        <testResources>
            <testResource>
                <directory>src/test/resources</directory>
            </testResource>
        </testResources>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.10.1</version>
                <configuration>
                    <encoding>${project.build.sourceEncoding}</encoding>
                    <source>${maven.compiler.source}</source>
                    <target>${maven.compiler.target}</target>
                    <compilerVersion>${maven.compiler.source}</compilerVersion>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>


 ```
