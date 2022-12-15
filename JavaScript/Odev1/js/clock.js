let pro=prompt(" ismini ver ")
document.getElementById("myName").innerHTML=pro

function showTime() {
    let today = new Date();
    let hour = today.getHours();
    let minute = today.getMinutes();
    let second = today.getSeconds();
    let days = [
        "Pazar",        "Pazartesi",        "Salı",        "Çarşamba",        "Perşembe",        "Cuma",        "Cumartesi",
      ];
  
  
hour=hour<10 ? "0"+hour:hour
second=second<10 ? "0"+second:second
minute=minute<10 ? "0"+minute:minute
document.getElementById('myClock').innerHTML =  hour + ":" + minute + ":" + second +" " +days[today.getDay()];
setInterval(showTime, 1000);
  }

  showTime()