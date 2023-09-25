def TestApp () {
  echo "Testing The App"
  echo "Executing pipeline into branch $BRANCH_NAME"
}

def BuildApp () {
  echo "Building the App from branch $BRANCH_NAME"
  sh 'cd /var/jenkins_home/workspace/nodejs-multibranch-pipeline_main/'
//  sh 'npx ci'
  sh 'npx turbo serve'
}

def DeployApp () {
  echo "Deploying Branch $BRANCH_NAME"
}

return this
