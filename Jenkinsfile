pipeline{
    agent any
    
    Stages{
    
        stage('Git Checkout'){
           
            steps{
                
                
                script{
                
                     git branch: 'master', url: 'https://github.com/neutron6/MC11.git'
                }
            }
        }
    }
}