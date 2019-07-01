FROM openjdk:12
RUN echo "DifiCamp Rules"
ADD target/eInnsyn.jar e-innsynv2.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar","e-innsynv2.jar"]
