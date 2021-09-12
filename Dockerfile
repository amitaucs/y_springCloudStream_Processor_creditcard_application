FROM adoptopenjdk
EXPOSE 8006
ADD target/creditCardVerification-1.0.0.jar  creditCardVerification.jar
ENV MSQL_HOSTNAME=mysql
ENV RMQ_HOSTNAME=rabbitmq
ENTRYPOINT [ "java", "-jar", "/creditCardVerification.jar"]