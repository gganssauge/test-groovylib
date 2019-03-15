pipeline {
    agent any

    options {
        timestamps()
        buildDiscarder(logRotator(numToKeepStr: '5'))
    }

    stages {
        stage("test") {
            steps {
                lib = load('lib.groovy')

                echo lib.hello('world')
            }
        }
    }
}
