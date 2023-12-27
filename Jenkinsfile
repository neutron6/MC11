@Library('my-shared-library') _
pipeline{
    agent any
    
    parameters{
         
         choice(name: 'action',choices: 'create\ndelete',description: 'Choose create/Destroy')
    }
    
    stages{
        when { expression { param.action == 'create' } }
        
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
        stage('Unit Test Maven'){
        
        when { expression { param.action == 'create' } }
            steps{
                
                
                script{
                
                    mvnTest()
                }
            }
        }
        stage('Integration Test Maven'){
        when { expression { param.action == 'create' } }   
            steps{
                
                
                script{
                
                    mvnIntegrationTest()
                }
            }
        }
        stage('Static code analysis: Sonarqube'){
        when { expression { param.action == 'create' } }   
            steps{
                
                
                script{
                
                    staticCodeAnalysis()
                }
            }
        }
    }
}