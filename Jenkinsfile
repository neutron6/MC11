@Library('my-shared-library') _
pipeline{
    agent any
    
    stages{
    
        stage('Git Checkout'){
           
            steps{
                
                
                script{
                
                    gitCheckout(
                      branch: "master",
                      url: "https://github.com/neutron6/MC11.git"
                    )
                }
            }
        }
    }
}