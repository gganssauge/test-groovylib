class Groovylib {
    def name

    def hello(String name) {
        this.name = name
        return "hello, $name"
    }

    def twoReturns() {
        return [1, 2]
    }

    def getName() {
        return name
    }
}

return new Groovylib()
