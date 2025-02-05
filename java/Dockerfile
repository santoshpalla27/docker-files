# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-slim

# Set the working directory in the container
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY . /app

# Compile the Java code
RUN javac MySQLConnectionTest.java

# Run the Java application
CMD ["java", "MySQLConnectionTest"]