class Groovylib {
    def hello(String name) {
        return "hello, $name"
    }

    def twoReturns() {
        return [1, 2]
    }
}

return new Groovylib()
