## 1. Requirements

<br>
Except external image crawling tool, all of image processing steps are done on python3.7 environment. <br>
Especially we use conda virtual environment, so if you want to continue the project you have to meet following environment conditions.
<br>

 - <b>Image crawling (external tool) [[github]](https://github.com/dmsehf804/CIC-Crawling_In_Crawling-/blob/master/README.md)</b>
 
<br>

You can find more detail about the tool in [README](https://github.com/dmsehf804/CIC-Crawling_In_Crawling-/blob/master/README.md)

<br>

 - <b>Image augmentation </b>

<br>
 
 If you need data augmentation, you should install following python packages. 
 [[environment]](https://github.com/minlee077/BARS/blob/master/image_processing/notebooks/environments/image_augmentation_environment.yml)
 
<br>

 - <b>Image classification </b>

<br>

 If you want to renew classification model, you should insall following python packages. [[environment]](https://github.com/minlee077/BARS/blob/master/image_processing/notebooks/environments/image_classification_environment.txt)
 
<br>

## 2. About Image processing

### Data Annotation tool

- VLC Media Player [[github]](https://github.com/videolan/vlc)
<br>

 Extracting frames(image) from videos

<br>

- Imgaug [[github]](https://github.com/aleju/imgaug-doc)

<br>
 
 Image augmentation package. If you meet the environment setting, you just follow [[notebook]](https://github.com/minlee077/BARS/blob/master/image_processing/notebooks/ImageAugmentation(cass).ipynb)

<br>

### Image Classification


- Deep learning Framework : [Tensorflow 2.0 Alpha](https://www.tensorflow.org/) & [Tensorflow lite](https://www.tensorflow.org/lite)


![tf_lite_image](https://cdn-images-1.medium.com/max/1000/0*Bt9qwKDjd1xi5RDd.)


 - Classification Architecture : Inception v3 [[arxiv]](https://arxiv.org/abs/1512.00567)

 Specific implementation : [[notebook]](https://github.com/minlee077/BARS/blob/master/image_processing/notebooks/ImageClassification.ipynb)
 
 
 
  ## 3. Summary
  
  The main purpose of this directory is to build a model(classifier) and then train it on tensorflow framework. When the whole learning process is done, you can save it as a '.tflite' extension file which contains model structure informations and also trained weights. Finally you can tranplant it on android application.<br> 
  You can find detail source codes on notebooks<br>
