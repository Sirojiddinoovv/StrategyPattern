# StrategyPattern

## Overview
StrategyPattern is a Kotlin-based Spring Boot service demonstrating the Strategy design pattern for payment processing.

## Features
- Exposes `POST /api/v1/debit`
- Routes requests to one of three `PayService` implementations (VISA, MASTERCARD, WALLET) based on the `pc` field
- Masks sensitive card data in logs
- Returns a transaction reference and status

## Getting Started

### Prerequisites
- Java 21
- Kotlin
- Gradle

### Build
```bash
# Maven
mvn clean package

# Gradle
./gradlew build
```

### Run
```bash
java -jar target/strategy-pattern-0.0.1-SNAPSHOT.jar
```

## API

### POST /api/v1/debit
**Request**:
```json
{
  "pc": "VISA",
  "cardNumber": "4111111111111111",
  "amount": 100.0
}
```

**Response**:
```json
{
    "refNum": 7888833,
    "card": "5512******9908"
}
```


