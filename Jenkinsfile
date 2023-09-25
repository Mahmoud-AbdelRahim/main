def gv

pipeline {
    agent any

    stages
    {
        stage('init') {
               steps {
                 script {
                    gv = load "script.groovy"
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
//               gv.TestApp()
                 echo "Testing The App"
                 echo "Executing pipeline into branch $BRANCH_NAME"

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
//                  gv.BuildApp()
                    echo "Building the App from branch $BRANCH_NAME"
                    sh 'cd /var/jenkins_home/workspace/nodejs-multibranch-pipeline_main/'
                    sh 'npx ci'
                    sh 'npx turbo serve'

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
//                   gv.DeployApp()
                     echo "Deploying Branch $BRANCH_NAME"

                }
            }
        }
    }
}
