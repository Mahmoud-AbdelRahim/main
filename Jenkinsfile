pipeline {
    agent any

    stages
    {
        stage('Test') {
           steps {
             script {
                echo "Testing The App"
                echo "Executing pipeline into branch $BRANCH_NAME"
             }
           }
        }

        stage('Build') {
           // when {
           //    BRANCH_NAME == 'main'
           // }

            steps {
                script {
                  echo "Building the App from branch $BRANCH_NAME"
                  sh 'cd /var/jenkins_home/workspace/Hima-Task/'
                  sh 'ls'
                }
            }
        }

        stage('Deploy') {
            // when {
            //   BRANCH_NAME == 'main'
            // }
            steps {
                script {
                    echo "Deploying Branch $BRANCH_NAME"
                }
            }
        }
    }
}
