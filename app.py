from flask import *


app = Flask(__name__)

@app.route('/')
def index():
    return 'Hello, World!'

@app.route('/about')
def about():
    return 'Pagina Sobre'



if __name__ == '__main__':
    app.run(debug=True)