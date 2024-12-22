package com.example.jcexampleforstudy.ui.model

data class PersonModel(
    val name: String,
    val title: String,
    val age: String
){
    companion object{
        fun getMockList()= listOf(
            PersonModel(
                name = "Tolgonai",
                title = "Android Developer",
                age = "20"
            ),
            PersonModel(
                name = "Albert",
                title = "Android Dev",
                age = "20"
            ) ,
            PersonModel(
                name = "Albert",
                title = "Android Dev",
                age = "20"
            ),
            PersonModel(
                name = "Albert",
                title = "Android Dev",
                age = "20"
            ),
            PersonModel(
                name = "Albert",
                title = "Android Dev",
                age = "20"
            ),
            PersonModel(
                name = "Tolgonai",
                title = "Android Developer",
                age = "20"
            ),
            PersonModel(
                name = "Albert",
                title = "Android Dev",
                age = "20"
            ) ,
            PersonModel(
                name = "Albert",
                title = "Android Dev",
                age = "20"
            ),
            PersonModel(
                name = "Albert",
                title = "Android Dev",
                age = "20"
            ),
            PersonModel(
                name = "Albert",
                title = "Android Dev",
                age = "20"
            ),
            PersonModel(
                name = "Tolgonai",
                title = "Android Developer",
                age = "20"
            ),
            PersonModel(
                name = "Albert",
                title = "Android Dev",
                age = "20"
            )
        )
    }
}
