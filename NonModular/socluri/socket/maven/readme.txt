1. maven.bat
2. build.bat
3. Se completeaza fisierul pom.xml dupa <dependencies>
    <build>
      <plugins>
        <plugin>
          <groupId>org.apache.maven.plugins</groupId>
          <artifactId>maven-compiler-plugin</artifactId>
          <version>3.6.2</version>
          <configuration>
            <source>1.9</source>
            <target>1.9</target>
          </configuration>
        </plugin>
      </plugins>
    </build> 
4. copy cmmdc-src/*.java -> socket/src/main/java/cmmdc
5. cd socket
6. mvn clean compile
7. mvn exec:java -Dexec.mainClass="cmmdc.socket.server.MyMServer"

1. maven.bat
2. cd socket
3. mvn exec:java -Dexec.mainClass="cmmdc.socket.client.ClientFXCmmdc"
   mvn exec:java -Dexec.mainClass="cmmdc.socket.client.VisualCmmdcClient"
   mvn exec:java -Dexec.mainClass="cmmdc.socket.client.CmmdcClient"   
 