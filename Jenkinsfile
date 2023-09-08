pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                bat 'cd Historical-Service && ./mvnw clean install'
                bat 'cd HotelService && ./mvnw clean install'
                bat 'cd TourService && ./mvnw clean install'
                bat 'cd eureka && ./mvnw clean install'
                bat 'cd apigateway && ./mvnw clean install'
                bat 'cd front'
                bat 'npm install'
            }
        }
        // stage('Test'){
        //     steps{
        //         bat 'mvn test'
        //     }
        // }
        stage('Deploy'){
            steps{
                bat 'cd Historical-Service && ./mvnw package'
                bat 'cd HotelService && ./mvnw package'
                bat 'cd TourService && ./mvnw package'
                bat 'cd eureka && ./mvnw package'
                bat 'cd apigateway && ./mvnw package'
            }
        }
    }
}