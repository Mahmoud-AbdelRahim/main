def TestApp () {
  echo "Testing The App"
  echo "Executing pipeline into branch $BRANCH_NAME"

  sh 'cd /var/jenkins_home/workspace/nodejs-multibranch-pipeline_main/'
  sh 'npm install'
  sh 'npm test'
}

def BuildApp () {
  echo "Building the App from branch $BRANCH_NAME"
  sh 'cd /var/jenkins_home/workspace/nodejs-multibranch-pipeline_main/'
//  sh 'npx ci'
//  sh 'npx turbo serve'
    sh 'npm run serve'
}

def DeployApp () {
  echo "Deploying Branch $BRANCH_NAME"
  //sh 'docker build -t NodeJs-App:1.0 /var/jenkins_home/workspace/nodejs-multibranch-pipeline_main'


}

return this
