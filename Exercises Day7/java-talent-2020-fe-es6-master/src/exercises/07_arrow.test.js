test('can replace traditional functions', () => {
    let fnMultiply,
        arrowMultiply;

    // Write two functions that take two params and return their product
    // For 'fnMultiply', set it equal to a regular function
    // For 'arrowMultiply', set it equal to an arrow function

    fnMultiply=function(a,b){
    return a*b;

    }
    arrowMultiply=(a,b) => a*b;

    expect(fnMultiply(5, 5))
        .toBe(arrowMultiply(5, 5));
});

test('can replace traditional functions #2', () => {
    const nums = [2, 5, 10];
    // Replace the 'function' in this 'map' call with an arrow function.
    // Hint: you shouldn't have any braces or 'return' after you are done


   // const squares = nums.map(function (num) {
     //   return num * num;

   // });
const squares = nums.map(num => num * num);
    expect(squares.shift())
        .toBe(4);
    expect(squares.shift())
        .toBe(25);
    expect(squares.shift())
        .toBe(100);
});

test('binds `this` to the eval scope, not the runtime scope', () => {
    // Change the person object. One of the functions should become an arrow to
    // allow for 'this' to retain context correctly
    const person = {
        name: 'John Doe',
        greetFriends: function (friends) {
            return friends.map(friend => this.name + ' greets to ' + friend);

        }
    };

    const friendsArray = ['I', 'Have', 'No', 'Friends'];
    expect(() => person.greetFriends(friendsArray))
        .not
        .toThrow();
});

test('can make array filter chains more manageable', () => {
    const data = [
        { type: 'Widget', name: 'Sprocket', price: 10.0, qty: 3 },
        { type: 'Widget', name: 'Bracket', price: 1.0, qty: 5 },
        { type: 'Widget', name: 'Brace', price: 2.5, qty: 1 },
        { type: 'Widget', name: 'Sprocket', price: 4.0, qty: 2 },
        { type: 'Food', name: 'Gouda', price: 8.75, qty: 4 },
        { type: 'Food', name: 'Bacon', price: 3.5, qty: 3 },
        { type: 'CD', name: 'Queen Best Hits', price: 5.5, qty: 5 },
        { type: 'CD', name: 'Brittney Best Hits', price: 6.25, qty: 3 },
        { type: 'CD', name: 'JT Best Hits', price: 2.25, qty: 6 }
    ];

    // REPLACE ALL REGULAR FUNCTIONS WITH ARROW FUNCTIONS
    const shoppingList = data

    .filter(d => d.type != 'Widget')

            .filter(d => d.price < 5)

            .sort(d => d.qty * -1)

            .map(d =>  d.name);


        //.filter(function (d) {
          //  return d.type != 'Widget';
        //}) // Remove Widgets
        //.filter(function (d) {
          //  return d.price < 5;
        //}) // Find only remaining items with price < 5
        //.sort(function (d) {
          //  return d.qty * -1;
        //}) // Sort by price, desc
        //.map(function (d) {
          //  return d.name;
        //}); // Pull just the name from each item

    expect(shoppingList.shift())
        .toBe('JT Best Hits');
    expect(shoppingList.shift())
        .toBe('Bacon');
});
