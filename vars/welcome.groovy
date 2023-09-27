def call(variant) {
  pipeline {
    agent any
    stages {
        stage('Hello') {
            steps {
                echo("${variant}")
                
            }
        }
    }
  }
}
