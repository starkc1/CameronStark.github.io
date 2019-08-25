const fs = require('fs');

pullTextFromEmail('email');

var relevantInfo = {
    'sender' : "",
    'to' : [],
    'cc' : [],
    'date' : '',
    'subject' : '',
    'body' : ''
}
var headerEnding;

function pullTextFromEmail(emailName) {
    fs.readFile(emailName + '.txt', (error, data) => {
        if (error) {
            console.log(error);
        }
    
        newData = data.toString().split('\n');
        getHeaderInfo(newData);
        
    });
}

function getHeaderInfo(data) {
    for (i = 0; i < data.length; i++) {

        if (data[i].startsWith('From:')) {
            relevantInfo.sender = data[i].substr(6, data[i].length);
        }

        if (data[i].startsWith('To:')) {
            toList = data[i].split(',');
            for (j = 0; j < toList.length; j++) {
                if (j == 0) {
                    relevantInfo.to[j] = toList[j].substr(4, toList[j].length);
                } else {
                    relevantInfo.to[j] = toList[j];
                }
            }
        }

        if (data[i].startsWith('CC:')) {
            ccList = data[i].split(',');
            for (j = 0; j < ccList.length; j++) {
                if (j == 0) {
                    relevantInfo.cc[j] = ccList[j].substr(4, toList[j].length);
                } else {
                    relevantInfo.cc[j] = ccList[j];
                }
            }
        }

        if (data[i].startsWith('Date:')) {
            relevantInfo.date = data[i].substr(6, data[i].length);
        }

        if (data[i].startsWith('Subject:')) {
            if (data[i+1].startsWith('Content-Type:')) {
                relevantInfo.subject = data[i].substr(9, data[i].length);
                headerEnding = i+1;
            } else {
                relevantInfo.subject = data[i].substr(9, data[i].length) + data[i+1];
                headerEnding = i+2;
            }
            
        }
    }
    getBody(newData);
}

function getBody(data) {
    for (i = headerEnding; i < data.length; i++) {
        if (data[i].includes('Thank You') || data[i].includes('Sincerely') || data[i].includes('Best regards')) {
            break;
        }
        relevantInfo.body = relevantInfo.body +  " " + data[i];
    }
    console.log(relevantInfo);
}


