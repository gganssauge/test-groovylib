class Groovylib {
    def pipeline
    def name

    static Groovylib instantiate(pipeline) {
        return new Groovylib(pipeline)
    }

    Groovylib(pipeline) {
        this.pipeline = pipeline
    }

    def hello(String name) {
        this.name = name
        return "hello, $name"
    }

    def runStep() {
        pipeline.sh('echo this is a pipeline')
    }

    def twoReturns() {
        return [1, 2]
    }

    def getName() {
        return name
    }
}

return Groovylib
