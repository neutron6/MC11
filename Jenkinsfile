@Library('my-shared-library') _
pipeline{
    agent any
    
    parameters{
         
         choice(name: 'action',choices: 'create\ndelete',description: 'Choose create/Destroy')
    }
    
    stages{
        
        stage('Git Checkout'){
        when { expression { params.action == 'create' } }  
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
        when { expression { params.action == 'create' } }
            steps{
                
                
                script{
                
                    mvnTest()
                }
            }
        }
        stage('Integration Test Maven'){
        when { expression { params.action == 'create' } }   
            steps{
                
                
                script{
                
                    mvnIntegrationTest()
                }
            }
        }
        stage('Static code analysis: Sonarqube'){
        when { expression { params.action == 'create' } }   
            steps{
                
                
                script{
                    def SonarQubecredentialsId = 'sonarqube-api'
                    staticCodeAnalysis(SonarQubecredentialsId)
                }
            }
        }
        stage('Quality Gate status check: Sonarqube'){
        when { expression { params.action == 'create' } }   
            steps{
                
                
                script{
                    def SonarQubecredentialsId = 'sonarqube-api'
                    QualityGateStatus(SonarQubecredentialsId)
                }
            }
        }
    }
}