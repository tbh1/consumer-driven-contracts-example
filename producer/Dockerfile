FROM niaquinto/gradle

COPY . /app

WORKDIR /app

# RUN gradle build \
# 	&& cp build/libs/*.jar producer.jar
# ENTRYPOINT ["java", "-jar"]
# CMD ["producer.jar"]

ENTRYPOINT ["gradle"]
CMD ["run"]