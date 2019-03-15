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
                    def l = load('lib.groovy')
                    lib = l.instantiate()
                    lib2 = l.instantiate()

                    echo lib.hello('world')
                    echo lib2.hello('cruel world')
                    (one, two) = lib.twoReturns()
                }
            }
        }

        stage("execute") {
            steps {
                script {
                    echo "$one, $two"
                    echo lib.hello(lib.name)
                    lib.runStep()
                }
            }
        }
    }
}
