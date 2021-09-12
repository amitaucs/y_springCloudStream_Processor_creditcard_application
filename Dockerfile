FROM adoptopenjdk
EXPOSE 8006
ADD target/creditCardVerification-1.0.0.jar  creditCardVerification.jar
ENTRYPOINT [ "java", "-jar", "/creditCardVerification.jar"]