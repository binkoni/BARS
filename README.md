[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
# BARS

 Beer Auto Recognition System for mobile


## 1. What is BARS?

<b>Beer Auto Recognition System(BARS)</b> is a mobile application that will help you search beers that you've never seen before.

Every Beer has it's distinct label that differentiates it from others. If you see a beer that you've never seen before or not familiar, take a photo of it's label with your phone camera and upload it at BARS application.
When the photo is uploaded, BARS program will operate through Image-Classification-Model based on deep-learning and find a match with the product on our database. 
When it is matched, information about beer comes up at the screen including the name, manufacturer, ABV(alcohol), type, avg.price, style, ratings.


To make the features more reliable, we will refer to the data on worldwide famous beer information websites such as ‘www.ratebeer.com’ or ‘www.beeradvocate.com’.
For maintenance, continuous interest to new beer products is required.

## 2. Use cases

#### case 1
 You went to a convenience store to grab some beers to drink. You are fed up with Korean beers that you’ve been drinking for years. Just then, you notice that there are lots of imported beers that you’ve never drank before. There are too many choices and it’s even hard to read the label because it’s written in foreign language. At the time you run the BARS app and take some photos of those beers and upload it. Now, You have all the info about those beers which will make you a smart consumer.
Enjoy the beer!

#### case 2
 You are a traveller visiting Korea. You wonder how the Korean beer will taste like. It’s seems like “Hite beer” and “Cass Beer” is the most famous beer in Korea. Take photos of two beers. upload it on the BARS app. You notice that the rating of those two beers are pretty low. You put those beers back on the shell and take some more photos of Korean beer. After a while, you find a beer with rather high rating. Grab it and enjoy it.

#### case 3
 You visited your friend’s house. He brought two bottles of foreign beer. He said grab one you like. You take photos of two beers and upload it on BARS app. Blue label beer is IPA beer which you prefer the most. Grab the beer and enjoy it.


## 3. Requirements

### For User
Android 8.0 (Oreo) (or higher version)
<br>

### For Developer

#### Application Development
<br> 
Android Studio 3.2 (installed on a Linux, Mac or Windows machine) <br>
Android TensorFlow Lite AAR<br>

You can find more detail about application development setting on [docs](https://www.tensorflow.org/lite/guide/android)

<br> 

#### Image Processing
<br>
Except external image crawling tool, all of image processing steps are done on python3.7 environment. <br>
Especially we use conda virtual environment, so if you want to continue the project you have to meet following environment conditions.
<br>

 - <b>Image crawling (external tool) [[github]](https://github.com/dmsehf804/CIC-Crawling_In_Crawling-/blob/master/README.md)
</b>
 
<br>
You can find more detail about the tool in [README](https://github.com/dmsehf804/CIC-Crawling_In_Crawling-/blob/master/README.md)
<br>
 - <b>Image augmentation </b>
<br>
 
 If you need data augmentation, you should install following python packages. [[environment]](https://github.com/minlee077/BARS/blob/master/image_processing/notebooks/environments/image_augmentation_environment.yml)
 
<br>
 - <b>Image classification </b>
<br>

 If you want to renew classification model, you should insall following python packages. [[environment]](https://github.com/minlee077/BARS/blob/master/image_processing/notebooks/environments/image_classification_environment.txt)
 
<br>

## 4. Installation Process

***to be updated ...***

<br>

## 5. About Image processing
### Data Annotation tool

- VLC Media Player [[github]](https://github.com/videolan/vlc)
<br>

 Extracting frames(image) from videos

<br>

- Imgaug [[github]](https://github.com/aleju/imgaug-doc)

<br>
 Image augmentation package. If you meet the environment setting you can just follow [[notebook]](https://github.com/minlee077/BARS/blob/master/image_processing/notebooks/ImageAugmentation(cass).ipynb)

<br>

### Image Processing 


- Deep learning Framework : [Tensorflow 2.0 Alpha](https://www.tensorflow.org/) & [Tensorflow lite](https://www.tensorflow.org/lite)


![tf_lite_image](https://cdn-images-1.medium.com/max/1000/0*Bt9qwKDjd1xi5RDd.)


 - Classification Architecture : Inception v3 [[arxiv]](https://arxiv.org/abs/1512.00567)

 Specific implementation : [[notebook]](https://github.com/minlee077/BARS/blob/master/image_processing/notebooks/ImageClassification.ipynb)

## 6. Tested Device

Device : Samsung Galaxy Note8 (SM-N950N) + Android 9.0 (Pie) <br>
Build environment: <br>
Mac OSX 10.11.6 <br>
bazel Version : 0.8 <br>
Android Studio 3.2 <br>
Android Build Tools Level: 26.1.1<br>
Android NDK Version: r19c <br>

## 7. Copyright

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

## 8. Contact Information

<b>[minlee077@naver.com](minlee077@naver.com)</b>


## 9. Members 
<b>

#### Image Processing Team 
* 박창준 [[Github]](https://github.com/CAUOBJ)
* 김청빈 [[Github]](https://github.com/ChungbinKim)
* 이정민 [[Github]](https://github.com/minlee077)

#### Application Development Team
* 황현제 [[Github]](https://github.com/HyeonJe)
* 서재훈 [[Github]](https://github.com/Jaehooooooon)

</b>


## 10. Change Logs

------------------ Alpha release 2019-05-24 ------------------
