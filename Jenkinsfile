def one
def two
def lib

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
                    lib2 = load('lib.groovy')

                    echo lib.hello('world')
                    echo lib2.hello('cruel world')
                    (one, two) = lib.twoReturns()
                }
            }
        }

        stage("execute") {
            steps {
                echo "$one, $two"
                echo lib.hello(lib.name)
            }
        }
    }
}
