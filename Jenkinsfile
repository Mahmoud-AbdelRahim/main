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
           steps {
             when {
               expression {
                 BRANCH_NAME == 'main'
               }
             }
             script {
                gv.TestApp()
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
                  gv.BuildApp()
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
