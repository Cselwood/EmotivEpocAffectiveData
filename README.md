# EmotivEpocAffectiveData
> A java-based method to write Affective data from the Epoc to a text file! Usable with Unity!

This program uses the .osc method of writing plain text data of the User's affective state in an Emotiv EPOC headset to a given file over port 7400. I used this class in my thesis to be interpreted as a text file by the Unity Engine. An alternative file could be a .xml file.

## Features

    - Compatible with all 5 of the major Affective measurements on the EPOC; Excitement, Boredom, Long Term Excitement, Meditation and Frustration
    - Can alternatively be designed to print to console instead.
    - No GUI needed.
    - Usable with UnityEngine, or other 3d Graphics Engines.
    - Lightweight code in Java.
    - Given the right tags, this program is compatible with all the other measurements too, such as Winking Left and Right, Furrowing, Raising Brows, Smiling, Clenching Teeth.

## How It's Made!

    - Java files
    - Runs over local network, default is port 7400.
    - OSC library files designed by Andreas Schlegel http://www.sojamo.de/libraries/oscP5

## Emotiv Epoc

Find out what the headset is, and does here: https://www.emotiv.com/epoc/

## Installation

Clone the repo and install yourself. WARNING: You may have to alter the imports in a way that oscP5 and netP5 can be seen by the file, and even the package name.

## Release History
* 1.0
   * Went public and allowed forking. This program was created many years ago, so this is the final version.

## Meta

Distributed under the MIT license. See ``LICENSE`` for more information.

[https://github.com/Cselwood](https://github.com/Cselwood)

## Contributing

If you see an issue, an efficiency that could be made, or an improvement, program away!
Fork it if you like (<https://github.com/Cselwood/EmotivEpocAffectiveData/fork>)
