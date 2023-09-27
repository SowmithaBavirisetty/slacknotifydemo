def call(name,variant) {
  pipeline {
    agent ${name}
    stages {
        stage('Hello') {
            steps {
                echo("${variant}")
                
            }
        }
    }
  }
}
