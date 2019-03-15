def one
def two

pipeline {
    agent any

    options {
        timestamps()
        buildDiscarder(logRotator(numToKeepStr: '5'))
    }

    stages {
        stage("prepare") {
            steps {
                script {
                    lib = load('lib.groovy')

                    echo lib.hello('world')
                    (one, two) = lib.twoReturns()
                }
            }
        }

        stage("execute") {
            steps {
                echo "$one, $two"
            }
        }
    }
}
