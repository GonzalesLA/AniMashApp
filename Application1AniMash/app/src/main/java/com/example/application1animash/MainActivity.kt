package com.example.application1animash

import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import android.widget.PopupWindow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var display1: ImageView
    private lateinit var display2: ImageView
    private lateinit var generateButton: Button
    private lateinit var image1Tag: String
    private lateinit var image2Tag: String

    private fun getResourceId(tag: String): Int {
        // Implement your logic to map the tag to the corresponding resource ID
        return when (tag) {
            "lion" -> R.drawable.lion
            "fish" -> R.drawable.fish
            "tiger" -> R.drawable.tiger
            "leopard" -> R.drawable.leopard
            "cat" -> R.drawable.cat
            "bugs" -> R.drawable.bugs
            "shark" -> R.drawable.shark
            "birds" -> R.drawable.birds
            "snake" -> R.drawable.snake
            "turtle" -> R.drawable.turtle
            "frog" -> R.drawable.frog
            "rhino" -> R.drawable.rhino
            "stingray" -> R.drawable.stingray
            "bat" -> R.drawable.bat
            "spider" -> R.drawable.spider
            "monkey" -> R.drawable.monkey
            "crab" -> R.drawable.crab
            "seal" -> R.drawable.seal

            else -> R.drawable.display_animal
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Loading activity_main.xml

        display1 = findViewById(R.id.display_1)
        display2 = findViewById(R.id.display_2)
        generateButton = findViewById(R.id.generate) // Initialize generateButton here

        val imageButtons = listOf<View>(
            findViewById(R.id.lion_image),
            findViewById(R.id.fish_image),
            findViewById(R.id.tiger_image),
            findViewById(R.id.leopard_image),
            findViewById(R.id.cat_image),
            findViewById(R.id.bug_image),
            findViewById(R.id.shark_image),
            findViewById(R.id.bird_image),
            findViewById(R.id.snake_image),
            findViewById(R.id.bird_image),
            findViewById(R.id.snake_image),
            findViewById(R.id.turtle_image),
            findViewById(R.id.frog_image),
            findViewById(R.id.rhino_image),
            findViewById(R.id.stingray_image),
            findViewById(R.id.bat_image),
            findViewById(R.id.spider_image),
            findViewById(R.id.monkey_image),
            findViewById(R.id.crab_image),
            findViewById(R.id.seal_image),
        )

        imageButtons.forEach { button ->
            button.setOnClickListener {
                val tag = button.tag.toString()
                if (!::image1Tag.isInitialized) {
                    image1Tag = tag
                    display1.setImageResource(getResourceId(tag))
                    return@setOnClickListener
                }
                if (!::image2Tag.isInitialized) {
                    image2Tag = tag
                    display2.setImageResource(getResourceId(tag))
                    generateButton.visibility = View.VISIBLE
                    return@setOnClickListener
                }
                // If two images are already selected, do nothing
            }
        }

        generateButton.setOnClickListener {
            val tag1 = image1Tag
            val tag2 = image2Tag

            val inflater = layoutInflater
            val view = inflater.inflate(R.layout.popup, null)
            val window = PopupWindow(
                view,
                WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.WRAP_CONTENT,
                true
            )
            window.showAtLocation(view, Gravity.CENTER, 0, 0)

            // Check if both display1 and display2 have specific IDs set
            if (::image1Tag.isInitialized && ::image2Tag.isInitialized) {
                val resourceId = when {
                    //Lion
                    tag1 == "lion" && tag2 == "fish" -> (R.drawable.lionfish_result)
                    tag1 == "fish" && tag2 == "lion" -> (R.drawable.lionfish_result)

                    tag1 == "lion" && tag2 == "bugs" -> (R.drawable.lionbug)
                    tag1 == "bugs" && tag2 == "lion" -> (R.drawable.lionbug)

                    tag1 == "lion" && tag2 == "birds" -> (R.drawable.lionbird)
                    tag1 == "birds" && tag2 == "lion" -> (R.drawable.lionbird)

                    tag1 == "lion" && tag2 == "spider" -> (R.drawable.lionspider)
                    tag1 == "spider" && tag2 == "lion" -> (R.drawable.lionspider)

                    tag1 == "lion" && tag2 == "monkey" -> (R.drawable.lionmonkey)
                    tag1 == "monkey" && tag2 == "lion" -> (R.drawable.lionmonkey)

                    tag1 == "lion" && tag2 == "seal" -> (R.drawable.lionseal)
                    tag1 == "seal" && tag2 == "lion" -> (R.drawable.lionseal)

                    //fish
                    tag1 == "fish" && tag2 == "tiger" -> (R.drawable.tigerfish)
                    tag1 == "tiger" && tag2 == "fish" -> (R.drawable.tigerfish)

                    tag1 == "fish" && tag2 == "leopard" -> (R.drawable.leopardfish)
                    tag1 == "leopard" && tag2 == "fish" -> (R.drawable.leopardfish)

                    tag1 == "fish" && tag2 == "cat" -> (R.drawable.catfish)
                    tag1 == "cat" && tag2 == "fish" -> (R.drawable.catfish)

                    tag1 == "fish" && tag2 == "snake" -> (R.drawable.snakefish)
                    tag1 == "snake" && tag2 == "fish" -> (R.drawable.snakefish)

                    tag1 == "fish" && tag2 == "bat" -> (R.drawable.batfish)
                    tag1 == "bat" && tag2 == "fish" -> (R.drawable.batfish)

                    tag1 == "fish" && tag2 == "spider" -> (R.drawable.spiderfish)
                    tag1 == "spider" && tag2 == "fish" -> (R.drawable.spiderfish)

                    //tiger
                    tag1 == "tiger" && tag2 == "bugs" -> (R.drawable.tigerbug)
                    tag1 == "bugs" && tag2 == "tiger" -> (R.drawable.tigerbug)

                    tag1 == "tiger" && tag2 == "shark" -> (R.drawable.tigershark)
                    tag1 == "shark" && tag2 == "tiger" -> (R.drawable.tigershark)

                    tag1 == "tiger" && tag2 == "birds" -> (R.drawable.tigerbird)
                    tag1 == "birds" && tag2 == "tiger" -> (R.drawable.tigerbird)

                    tag1 == "tiger" && tag2 == "snake" -> (R.drawable.tigersnake)
                    tag1 == "snake" && tag2 == "tiger" -> (R.drawable.tigersnake)

                    tag1 == "tiger" && tag2 == "frog" -> (R.drawable.tigerfrog)
                    tag1 == "frog" && tag2 == "tiger" -> (R.drawable.tigerfrog)

                    tag1 == "tiger" && tag2 == "stingray" -> (R.drawable.tigerray)
                    tag1 == "stingray" && tag2 == "tiger" -> (R.drawable.tigerray)

                    tag1 == "tiger" && tag2 == "spider" -> (R.drawable.tigerspider)
                    tag1 == "spider" && tag2 == "tiger" -> (R.drawable.tigerspider)

                    tag1 == "tiger" && tag2 == "seal" -> (R.drawable.tigerseal)
                    tag1 == "seal" && tag2 == "tiger" -> (R.drawable.tigerseal)

                    //leopard
                    tag1 == "leopard" && tag2 == "stingray" -> (R.drawable.leopardray)
                    tag1 == "stingray" && tag2 == "leopard" -> (R.drawable.leopardray)

                    tag1 == "leopard" && tag2 == "crab" -> (R.drawable.leopardcrab)
                    tag1 == "crab" && tag2 == "leopard" -> (R.drawable.leopardcrab)

                    tag1 == "leopard" && tag2 == "seal" -> (R.drawable.leopardseal)
                    tag1 == "seal" && tag2 == "leopard" -> (R.drawable.leopardseal)

                    tag1 == "leopard" && tag2 == "bugs" -> (R.drawable.leopardbug)
                    tag1 == "bugs" && tag2 == "leopard" -> (R.drawable.leopardbug)

                    tag1 == "leopard" && tag2 == "cat" -> (R.drawable.leopardcat)
                    tag1 == "cat" && tag2 == "leopard" -> (R.drawable.leopardcat)

                    tag1 == "leopard" && tag2 == "shark" -> (R.drawable.leopardshark)
                    tag1 == "shark" && tag2 == "leopard" -> (R.drawable.leopardshark)

                    tag1 == "leopard" && tag2 == "snake" -> (R.drawable.leopardsnake)
                    tag1 == "snake" && tag2 == "leopard" -> (R.drawable.leopardsnake)

                    tag1 == "leopard" && tag2 == "turtle" -> (R.drawable.leopardturtle)
                    tag1 == "turtle" && tag2 == "leopard" -> (R.drawable.leopardturtle)

                    tag1 == "leopard" && tag2 == "frog" -> (R.drawable.leopardfrog)
                    tag1 == "frog" && tag2 == "leopard" -> (R.drawable.leopardfrog)

                    tag1 == "leopard" && tag2 == "spider" -> (R.drawable.leopardspider)
                    tag1 == "spider" && tag2 == "leopard" -> (R.drawable.leopardspider)

                    //cat
                    tag1 == "cat" && tag2 == "shark" -> (R.drawable.catshark)
                    tag1 == "shark" && tag2 == "cat" -> (R.drawable.catshark)

                    tag1 == "cat" && tag2 == "birds" -> (R.drawable.catbird)
                    tag1 == "birds" && tag2 == "cat" -> (R.drawable.catbird)

                    tag1 == "cat" && tag2 == "snake" -> (R.drawable.catsnake)
                    tag1 == "snake" && tag2 == "cat" -> (R.drawable.catsnake)

                    tag1 == "cat" && tag2 == "spider" -> (R.drawable.catspider)
                    tag1 == "spider" && tag2 == "cat" -> (R.drawable.catspider)

                    //bugs
                    tag1 == "bugs" && tag2 == "birds" -> (R.drawable.bugbird)
                    tag1 == "birds" && tag2 == "bugs" -> (R.drawable.bugbird)

                    tag1 == "bugs" && tag2 == "rhino" -> (R.drawable.bugrhino)
                    tag1 == "rhino" && tag2 == "bugs" -> (R.drawable.bugrhino)

                    tag1 == "bugs" && tag2 == "bat" -> (R.drawable.bugrhino)
                    tag1 == "bat" && tag2 == "bugs" -> (R.drawable.bugrhino)

                    //shark
                    tag1 == "shark" && tag2 == "snake" -> (R.drawable.sharksnake)
                    tag1 == "snake" && tag2 == "shark" -> (R.drawable.sharksnake)

                    tag1 == "shark" && tag2 == "frog" -> (R.drawable.sharkfrog)
                    tag1 == "frog" && tag2 == "shark" -> (R.drawable.sharkfrog)

                    tag1 == "shark" && tag2 == "bat" -> (R.drawable.sharkbat)
                    tag1 == "bat" && tag2 == "shark" -> (R.drawable.sharkbat)

                    // birds
                    tag1 == "birds" && tag2 == "snake" -> (R.drawable.birdsnake)
                    tag1 == "snake" && tag2 == "birds" -> (R.drawable.birdsnake)

                    tag1 == "birds" && tag2 == "rhino" -> (R.drawable.birdrhino)
                    tag1 == "rhino" && tag2 == "birds" -> (R.drawable.birdrhino)

                    tag1 == "birds" && tag2 == "spider" -> (R.drawable.birdspider)
                    tag1 == "spider" && tag2 == "birds" -> (R.drawable.birdspider)

                    tag1 == "birds" && tag2 == "crab" -> (R.drawable.birdcrab)
                    tag1 == "crab" && tag2 == "birds" -> (R.drawable.birdcrab)

                    // snake
                    tag1 == "snake" && tag2 == "turtle" -> (R.drawable.snaketurtle)
                    tag1 == "turtle" && tag2 == "snake" -> (R.drawable.snaketurtle)

                    tag1 == "snake" && tag2 == "rhino" -> (R.drawable.nakerhino)
                    tag1 == "rhino" && tag2 == "snake" -> (R.drawable.nakerhino)

                    tag1 == "snake" && tag2 == "spider" -> (R.drawable.snakespider)
                    tag1 == "spider" && tag2 == "snake" -> (R.drawable.snakespider)

                    // turtle
                    tag1 == "turtle" && tag2 == "frog" -> (R.drawable.turtlefrog)
                    tag1 == "frog" && tag2 == "turtle" -> (R.drawable.turtlefrog)

                    tag1 == "turtle" && tag2 == "spider" -> (R.drawable.turtlespider)
                    tag1 == "spider" && tag2 == "turtle" -> (R.drawable.turtlespider)

                    tag1 == "turtle" && tag2 == "crab" -> (R.drawable.turtlecrab)
                    tag1 == "crab" && tag2 == "turtle" -> (R.drawable.turtlecrab)

                    // frog
                    tag1 == "frog" && tag2 == "rhino" -> (R.drawable.frogrhino)
                    tag1 == "rhino" && tag2 == "frog" -> (R.drawable.frogrhino)

                    tag1 == "frog" && tag2 == "crab" -> (R.drawable.frogcrab)
                    tag1 == "crab" && tag2 == "frog" -> (R.drawable.frogcrab)

                    // rhino
                    tag1 == "rhino" && tag2 == "stingray" -> (R.drawable.rhinoray)
                    tag1 == "stingray" && tag2 == "rhino" -> (R.drawable.rhinoray)

                    tag1 == "rhino" && tag2 == "bat" -> (R.drawable.rhinobat)
                    tag1 == "bat" && tag2 == "rhino" -> (R.drawable.rhinobat)

                    tag1 == "rhino" && tag2 == "crab" -> (R.drawable.rhinocrab)
                    tag1 == "crab" && tag2 == "rhino" -> (R.drawable.rhinocrab)

                    // stingray
                    tag1 == "stingray" && tag2 == "bat" -> (R.drawable.sharkbat)
                    tag1 == "bat" && tag2 == "stingray" -> (R.drawable.sharkbat)

                    // bat
                    tag1 == "bat" && tag2 == "monkey" -> (R.drawable.sharkbat)
                    tag1 == "monkey" && tag2 == "bat" -> (R.drawable.sharkbat)

                    // spider
                    tag1 == "spider" && tag2 == "crab" -> (R.drawable.spidercrab)
                    tag1 == "crab" && tag2 == "spider" -> (R.drawable.crabspider)

                    tag1 == "spider" && tag2 == "monkey" -> (R.drawable.spidermonkey)
                    tag1 == "monkey" && tag2 == "spider" -> (R.drawable.spidermonkey)

                    // monkey
                    tag1 == "monkey" && tag2 == "seal" -> (R.drawable.monkeyseal)
                    tag1 == "seal" && tag2 == "monkey" -> (R.drawable.monkeyseal)

                    tag1 == "monkey" && tag2 == "crab" -> (R.drawable.monkeycrab)
                    tag1 == "crab" && tag2 == "monkey" -> (R.drawable.monkeycrab)

                    // crab
                    tag1 == "crab" && tag2 == "seal" -> (R.drawable.crabseal)
                    tag1 == "seal" && tag2 == "crab" -> (R.drawable.crabseal)

                    // Add more combinations as needed
                    else -> R.drawable.display_animal
                }

                val text = when {
                    //lion results
                    tag1 == "lion" && tag2 == "fish" -> "Lionfish"
                    tag1 == "fish" && tag2 == "lion" -> "Lionfish"

                    tag1 == "lion" && tag2 == "bugs" -> "Ant Lion"
                    tag1 == "bugs" && tag2 == "lion" -> "Ant Lion"

                    tag1 == "lion" && tag2 == "birds" -> "The Griffin"
                    tag1 == "birds" && tag2 == "lion" -> "The Griffin"

                    tag1 == "lion" && tag2 == "spider" -> "Megaloremmius"
                    tag1 == "spider" && tag2 == "lion" -> "Megaloremmius"

                    tag1 == "lion" && tag2 == "monkey" -> "Lion Tamarins"
                    tag1 == "monkey" && tag2 == "lion" -> "Lion Tamatins"

                    tag1 == "lion" && tag2 == "seal" -> "Sea Lions"
                    tag1 == "seal" && tag2 == "lion" -> "Sea Lions"

                    //fish results
                    tag1 == "fish" && tag2 == "snake" -> "Snakehead"
                    tag1 == "snake" && tag2 == "fish" -> "Snakehead"

                    tag1 == "fish" && tag2 == "tiger" -> "Tigerfish"
                    tag1 == "tiger" && tag2 == "fish" -> "Tigerfish"

                    tag1 == "fish" && tag2 == "leopard" -> "Bushfish"
                    tag1 == "leopard" && tag2 == "fish" -> "Bushfish"

                    tag1 == "fish" && tag2 == "cat" -> "Catfish"
                    tag1 == "cat" && tag2 == "fish" -> "Catfish"

                    tag1 == "fish" && tag2 == "bat" -> "Batfish"
                    tag1 == "bat" && tag2 == "fish" -> "Batfish"

                    tag1 == "fish" && tag2 == "spider" -> "Bathypterois"
                    tag1 == "spider" && tag2 == "fish" -> "Bathypterois"

                    // tiger results
                    tag1 == "tiger" && tag2 == "spider" -> "Poecilotheria vittata"
                    tag1 == "spider" && tag2 == "tiger" -> "Poecilotheria vittata"

                    tag1 == "tiger" && tag2 == "bugs" -> "Tiger Beetle"
                    tag1 == "bugs" && tag2 == "tiger" -> "Tiger Beetle"

                    tag1 == "tiger" && tag2 == "shark" -> "Tigershark"
                    tag1 == "shark" && tag2 == "tiger" -> "Tigershark"

                    tag1 == "tiger" && tag2 == "birds" -> "Tiger Heron"
                    tag1 == "birds" && tag2 == "tiger" -> "Tiger Heron"

                    tag1 == "tiger" && tag2 == "snake" -> "Tigersnake"
                    tag1 == "snake" && tag2 == "tiger" -> "Tigersnake"

                    tag1 == "tiger" && tag2 == "frog" -> "Hyloscirtus Tigrinus"
                    tag1 == "frog" && tag2 == "tiger" -> "Hyloscirtus Tigrinus"

                    tag1 == "tiger" && tag2 == "stingray" -> "Potamotrygen Tigrina"
                    tag1 == "stingray" && tag2 == "tiger" -> "Potamotrygen Tigrina"

                    tag1 == "tiger" && tag2 == "seal" -> "Tiger Seal"
                    tag1 == "seal" && tag2 == "tiger" -> "Tiger Seal"

                    // leopard results
                    tag1 == "leopard" && tag2 == "stingray" -> "Leopard Whipray"
                    tag1 == "stingray" && tag2 == "leopard" -> "Leopard Whipray"

                    tag1 == "leopard" && tag2 == "crab" -> "Hepatus Epheliticus"
                    tag1 == "crab" && tag2 == "leopard" -> "Hepatus Epheliticus"

                    tag1 == "leopard" && tag2 == "seal" -> "Leopard Seal"
                    tag1 == "seal" && tag2 == "leopard" -> "Leopard Seal"

                    tag1 == "leopard" && tag2 == "bugs" -> "The Giant Leopard Moth"
                    tag1 == "bugs" && tag2 == "leopard" -> "The Giant Leopard Moth"

                    tag1 == "leopard" && tag2 == "cat" -> "Leopard Cat"
                    tag1 == "cat" && tag2 == "leopard" -> "Leopard Cat"

                    tag1 == "leopard" && tag2 == "shark" -> "Leopard Shark"
                    tag1 == "shark" && tag2 == "leopard" -> "Leopard Shark"

                    tag1 == "leopard" && tag2 == "snake" -> "European Ratsnake"
                    tag1 == "snake" && tag2 == "leopard" -> "European Ratsnake"

                    tag1 == "leopard" && tag2 == "turtle" -> "Leopard Tortoise"
                    tag1 == "turtle" && tag2 == "leopard" -> "Leopard Tortoise"

                    tag1 == "leopard" && tag2 == "frog" -> "Leopard Frog"
                    tag1 == "frog" && tag2 == "leopard" -> "Leopard Frog"

                    tag1 == "leopard" && tag2 == "spider" -> "Arctosa Leopardus"
                    tag1 == "spider" && tag2 == "leopard" -> "Arctosa Leopardus"

                    // cat results
                    tag1 == "cat" && tag2 == "shark" -> "Catshark"
                    tag1 == "shark" && tag2 == "ca" -> "Catshark"

                    tag1 == "cat" && tag2 == "birds" -> "Catbird"
                    tag1 == "birds" && tag2 == "ca" -> "Catbird"

                    tag1 == "cat" && tag2 == "snake" -> "European Catsnake"
                    tag1 == "snake" && tag2 == "ca" -> "European Catsnake"

                    tag1 == "cat" && tag2 == "spider" -> "Orb-Weaver Spider"
                    tag1 == "spider" && tag2 == "ca" -> "Orb-Weaver Spider"

                    // bugs results
                    tag1 == "bugs" && tag2 == "birds" -> "Hummingbird Moth"
                    tag1 == "birds" && tag2 == "bugs" -> "Hummingbird Moth"

                    tag1 == "bugs" && tag2 == "rhino" -> "Rhinocerous Beetle"
                    tag1 == "rhino" && tag2 == "bugs" -> "Rhinocerous Beetle"

                    tag1 == "bugs" && tag2 == "bat" -> "Batbug"
                    tag1 == "bat" && tag2 == "bugs" -> "Batbug"

                    // shark results
                    tag1 == "sharks" && tag2 == "snake" -> "Frilled Shark"
                    tag1 == "snake" && tag2 == "sharks" -> "Frilled Shark"

                    tag1 == "sharks" && tag2 == "frog" -> "Sominosus longas Shark"
                    tag1 == "frog" && tag2 == "sharks" -> "Sominosus longas Shark"

                    tag1 == "sharks" && tag2 == "bat" -> "Bat Ray"
                    tag1 == "bat" && tag2 == "sharks" -> "Bat Ray"

                    // birds results
                    tag1 == "birds" && tag2 == "snake" -> "Savanna Vine Snake"
                    tag1 == "snake" && tag2 == "birds" -> "Savanna Vine Snake"

                    tag1 == "birds" && tag2 == "rhino" -> "Oxpecker"
                    tag1 == "rhino" && tag2 == "birds" -> "Oxpecker"

                    tag1 == "birds" && tag2 == "spider" -> "Tarantula"
                    tag1 == "spider" && tag2 == "birds" -> "Tarantula"

                    tag1 == "birds" && tag2 == "crab" -> "Crab-Plovers"
                    tag1 == "crab" && tag2 == "birds" -> "Crab-Plovers"

                    // snake results
                    tag1 == "snake" && tag2 == "turtle" -> "Eastern Long Neck Turtle"
                    tag1 == "turtle" && tag2 == "snake" -> "Eastern Long Neck Turtle"

                    tag1 == "snake" && tag2 == "rhino" -> "Rhinocerous Ratsnake"
                    tag1 == "rhino" && tag2 == "snake" -> "Rhinocerous Ratsnake"

                    tag1 == "snake" && tag2 == "spider" -> "Spider Tailed Horned Viper"
                    tag1 == "spider" && tag2 == "snake" -> "Spider Tailed Horned Viper"

                    // turtle results
                    tag1 == "turtle" && tag2 == "frog" -> "Myobatrachus"
                    tag1 == "frog" && tag2 == "turtle" -> "Myobatrachus"

                    tag1 == "turtle" && tag2 == "spider" -> "Spider Tortise"
                    tag1 == "spider" && tag2 == "turtle" -> "Spider Tortoise"

                    tag1 == "turtle" && tag2 == "crab" -> "Umbrella Crab"
                    tag1 == "crab" && tag2 == "turtle" -> "Umbrella Crab"

                    // frogs results
                    tag1 == "frog" && tag2 == "rhino" -> "Limnonectes Plicatellus"
                    tag1 == "rhino" && tag2 == "frog" -> "Limnonectes Plicatellus"

                    tag1 == "frog" && tag2 == "crab" -> "Raninidae"
                    tag1 == "crab" && tag2 == "frog" -> "Raninidae"

                    // rhino results
                    tag1 == "rhino" && tag2 == "stingray" -> "Cownose Ray"
                    tag1 == "stingray" && tag2 == "rhino" -> "Cownose Ray"

                    tag1 == "rhino" && tag2 == "bat" -> "Horsehoe Bat"
                    tag1 == "bat" && tag2 == "rhino" -> "Horsehoe Bat"

                    tag1 == "rhino" && tag2 == "crab" -> "Golf-Ball Crab"
                    tag1 == "crab" && tag2 == "rhino" -> "Golf-Ball Crab"

                    // stingray results
                    tag1 == "stingray" && tag2 == "bat" -> "Bat Ray"
                    tag1 == "bat" && tag2 == "stingray" -> "Bat Ray"

                    // bat results
                    tag1 == "bat" && tag2 == "monkey" -> "Fijin Monkey Faced Bat"
                    tag1 == "monkey" && tag2 == "bat" -> "Fijin Monkey Faced Bat"

                    // spider results
                    tag1 == "spider" && tag2 == "crab" -> "Spider Crab"
                    tag1 == "crab" && tag2 == "spider" -> "Crab SPider"

                    tag1 == "spider" && tag2 == "monkey" -> "Spider Monkey"
                    tag1 == "monkey" && tag2 == "spider" -> "Spider Monkey"

                    // monkey results
                    tag1 == "monkey" && tag2 == "crab" -> "Pitheciidae"
                    tag1 == "crab" && tag2 == "monkey" -> "Pitheciidae"

                    tag1 == "monkey" && tag2 == "seal" -> "Monk Seal"
                    tag1 == "seal" && tag2 == "monkey" -> "Monk Seal"

                    // crab results
                    tag1 == "crab" && tag2 == "seal" -> "Crabeater Seal"
                    tag1 == "seal" && tag2 == "crab" -> "Crabeater Seal"

                    // Add more combinations as needed
                    else -> "Unknown combination"
                }

                val inflater = layoutInflater
                val view = inflater.inflate(R.layout.popup, null)
                val window = PopupWindow(
                    view,
                    WindowManager.LayoutParams.WRAP_CONTENT,
                    WindowManager.LayoutParams.WRAP_CONTENT,
                    true
                )

                val popupImageView = view.findViewById<ImageView>(R.id.animal_result_image)
                val popupTextView = view.findViewById<TextView>(R.id.animal_result_title)

                popupImageView.setImageResource(resourceId)
                popupTextView.text = text;

                window.showAtLocation(view, Gravity.CENTER, 0, 0)
            } else {
                // Handle the case when both images are not selected
                Toast.makeText(this, "Please select both images", Toast.LENGTH_SHORT).show()
            }
            }
        }
    }