//Load express
const express = require("express");
const app = express();

app.get('/',(req,res) =>{
    res.send("This is the products service");
})

app.listen(4545,()=>{
    console.log("Up and running! -- This is our Products service");
})