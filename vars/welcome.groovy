def call(name,variant) {
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
