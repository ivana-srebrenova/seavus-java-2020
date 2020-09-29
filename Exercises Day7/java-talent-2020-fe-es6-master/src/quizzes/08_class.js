import log from './helpers/pretty-log';

// TODO: refactor into class syntax
function Person(name = 'John', lastname = 'Doe') {
    this.name = name;
    this.lastname = lastname;
    this.friends = [];
}

// TODO: fit into class syntax
Person.prototype.addFriend = function (friend) {
    this.friends.push(friend);
};

// TODO: fit into class syntax
Person.prototype.getPersonInfo = function () {
    return `${this.name} ${this.lastname} has ${this.friends.length} friends`;
};

function testPerson() {
    const p = new Person();
    p.addFriend('Doge');
    p.addFriend('Cookie');
    log(p.getPersonInfo());
}

//testPerson();


/*







SOLUTIONS ARE BELOW









 */
class PersonSolution {

    constructor(name = 'John', lastname = 'Doe') {
        this.name = name;
        this.lastname = lastname;
        this.friends = [];
    }

    addFriend = (friend) => {
        this.friends.push(friend);
    };

    getPersonInfo = () => {
        return `${this.name} ${this.lastname} has ${this.friends.length} ${this.friends.length === 1 ? 'friend' : 'friends'}`;
    };
}

function testPersonSolution() {
    const p = new PersonSolution();
    p.addFriend('Doge');
    p.addFriend('Cookie');
    log(p.getPersonInfo());
}

//testPersonSolution();

