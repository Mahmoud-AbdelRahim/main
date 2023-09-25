def gv

pipeline {
    agent any

    stages
    {
        stage('init') {
               steps {
                 script {
                    //gv = load "script.groovy"
                     echo "Testing The App"
                      echo "Executing pipeline into branch $BRANCH_NAME"
                 }
               }
        }

        stage('Test') {
           when {
             expression {
               BRANCH_NAME == 'main'
             }
           }
           steps {
             script {
               // gv.TestApp()
                echo "Building the App from branch $BRANCH_NAME"
                sh 'cd /var/jenkins_home/workspace/Hima-Task/'
                sh 'npx ci'
                sh 'npx turbo serve'
             }
           }
        }

        stage('Build') {
            when {
              expression {
                 BRANCH_NAME == 'main'
              }
            }
            steps {
                script {
                 // gv.BuildApp()
                 echo "Deploying Branch $BRANCH_NAME"
                }
            }
        }

        stage('Deploy') {
            when {
              expression {
                 BRANCH_NAME == 'main'
              }
            }
            steps {
                script {
                   gv.DeployApp()
                }
            }
        }
    }
}
