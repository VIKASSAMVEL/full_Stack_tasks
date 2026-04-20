# Task 14: Microservices-based Architecture Design

## Architecture Overview
The monolithic application is split into two independent services based on "Single Responsibility Principle".

1. **Student Service**: Responsible for handling student registration and bio-data.
2. **Academic Service**: Responsible for handling enrollments and course records.

## Design Principles Applied
- **Loose Coupling**: Services communicate via REST APIs instead of shared database tables.
- **Independent Deployment**: Each service can be built and deployed independently using its own Maven pom.xml and database configuration.
- **Single Responsibility**: Student service only focuses on profile data; Academic service focuses on marks and progress.
