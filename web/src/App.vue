<template>
  <!-- <div>
    <div>Bot昵称：{{bot_name}}</div>
    <div>Bot战力：{{bot_rating}}</div>
  </div> -->


  <NavBar />

  <router-view/>
</template>


<script>
import NavBar from '@/components/NavBar.vue'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap/dist/js/bootstrap.min'


export default{
  components:{
    NavBar
  }
}

// import $ from "jquery";
// import { ref } from "vue";

// export default{
//   name:"APP",
//   setup:()=>{
//     let bot_name=ref("");
//     let bot_rating=ref("");

//     $.ajax({
//       url:"http://localhost:3000/pk/getbotinfo/",
//       type:"get",
//       success: resp=>{
//         bot_name.value=resp.name;
//         bot_rating.value=resp.rating;
//       }
//     })
//     return{
//       bot_name,bot_rating
//     } 
//   }
// }


</script>




<style>

body{
  background-image: url("@/assets/2.png");
  background-size:cover;  
}


</style>
