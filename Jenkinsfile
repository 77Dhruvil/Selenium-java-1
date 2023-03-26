pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Build World'
            }
        }
        stage('Test') {
            steps {
                echo 'Test World'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy World'
            }
        }
    
        }
        
        post
        {
            always
            {
                emailext body: 'Summary', subject: 'pipline status', to: 'pateldhruvil2119976@gmail.com'
            }
        }
}
