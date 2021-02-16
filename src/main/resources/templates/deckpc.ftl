<#import "/spring.ftl" as spring/>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="/static/css/style.css" type="text/css">
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
    <title>Document</title>
</head>
<head>
    <meta charset="UTF-8">
    <title>Table</title>
</head>
<body>
<div class="container">
    <a href="/web/cards/refresh">
        <button>New Game
        </button>
    </a>
    <a href="/web/cards/nextround">
        <button>next Round
        </button>
    </a>
    <a class="btnStop" href="/web/cards/stop">
        <button>Stop</button>
    </a>
    <div class="table">
        <h1>ROUND <<${round}>></h1>
        <h2>Player ${score} PC</h2>
        <div class="backSideCard">
            <h1 style="position: absolute; margin-left: 22px ; color: aliceblue;border: solid black;background: black">${sizeDeck}</h1>
            <a id="bSideCard" href="#">
                <img src="/img/img_1.png" alt="lol">
            </a>
        </div>
        <div class="allCard">
            <div class="cardPlayer">
                <h3 class="sumCard">${sum}</h3>
                <div class="message">
                    <a class="message">${message}</a>
                </div>
                <div class="cardColum">
                    <ul>
                        <#list delivery as card>

                            <li>

                                <img src="${card.img}" alt="card">
                            </li>

                        </#list>
                    </ul>
                </div>
            </div>
            <li class="cardPC">
                <h3 class="sumCard">${sum2}</h3>
                <ul>
                    <#list pcdelivery as card>
                        <li>
                            <img src="${card.img}" alt="pcCard">
                        </li>
                    </#list>
                </ul>
        </div>
    </div>
</div>
</div>
</body>
</html>
