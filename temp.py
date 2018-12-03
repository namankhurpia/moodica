import pickle
import flask

app = flask.Flask(__name__)

#getting our trained model from a file we created earlier
model = pickle.load(open("model.pkl","r"))

@app.route('/predict', methods=['POST'])
def predict():
    #grabbing a set of wine features from the request's body
    feature_array = request.get_json()['sentence']
    
    #our model rates the wine based on the input array
    prediction = model.predict(str([sentence]))
    
    #preparing a response object and storing the model's predictions
    response = {}
    response['predictions'] = prediction
    
    #sending our response object back as json
    return flask.jsonify(response)