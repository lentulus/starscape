# Starscape Project

This is a multi-module Maven project with two Spring Boot executables:
- makestars: for creating stars
- querystars: for querying stars

A shared objects module contains entity classes. Both executables use Spring Data JPA with an H2 in-memory database.

## Modules
- objects: Shared entity classes (e.g., Star)
- makestars: Spring Boot app for star creation
- querystars: Spring Boot app for star queries

## Build

    mvn clean install

## Run

    cd makestars && mvn spring-boot:run
    cd querystars && mvn spring-boot:run

## H2 Console

Visit http://localhost:8080/h2-console (makestars) or http://localhost:8080/h2-console (querystars)

