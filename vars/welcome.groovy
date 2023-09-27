def call(String name,variant) {
  pipeline {
    agent {label '${name}'}
    stages {
        stage('Hello') {
            steps {
                echo("${variant}")
                
            }
        }
    }
  }
}
