@Library('my-shared-library') _
pipeline{
    agent any
    
    parameters{
         
         choice(name: 'action',choices: 'create\ndelete',description: 'Choose create/Destroy')
         /*
         string(name: 'ImageName', description: "name of the docker build", defaultValue: 'javapp')
         string(name: 'ImageTag', description: "tag of the docker build", defaultValue: 'v1')
         string(name: 'AppName', description: "name of the Application", defaultValue: 'springboot')
         string(name: 'DockerHubUser', description: "name of the Application", defaultValue: 'rushikeshnichit')
         */
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
        /*
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
        stage('Maven build: maven'){
        when { expression { params.action == 'create' } }   
            steps{
                
                
                script{
                    
                    mvnBuild()
                }
            }
        }
        */
        stage('Docker Image Build'){
        when { expression { params.action == 'create' } }   
            steps{
                
                
                script{
                     
                    bat "docker build -t mc11/mc11parent-1.0-snapshot-jar-with-dependencies ."
                }
            }
        }
        stage('Docker Build and Push'){
        when { expression { params.action == 'create' } }   
            steps{
                
                
                script{
                   withCredentials([string(credentialsId: 'dockerhub-pwd2', variable: 'dockerhubpwd')]){
                       bat "docker login -u rushikeshnichit -p ${dockerhubpwd}" 
                    }
                    bat "docker push rushikeshnichit/mc11parent-1.0-snapshot-jar-with-dependencies"                    
                }
            }
        }
    }
}