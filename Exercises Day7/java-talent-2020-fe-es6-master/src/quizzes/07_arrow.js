import log from './helpers/pretty-log';

function multiArgument() {
    // refactor to an arrow function
    const divide = function (a, b) {
        return a / b;
    };
    return divide(40, 10);
}

// log(multiArgument())

function noArgument() {
    // refactor to an arrow function
    const getFive = function () {
        return 5;
    };
    return getFive();
}

// log(noArgument())

function singleArgument() {
    // refactor to an arrow function
    const identity = function (i) {
        return i;
    };
    return identity(350);
}

// log(singleArgument())

function spreadWithArrow() {
    // refactor to an arrow function
    const asArray = function (...args) {
        return args;
    };
    return asArray(1, 2, 3, 4);
}

// log(spreadWithArrow())

function withStatements() {
    // refactor to an arrow function
    const tryInvoke = function (obj, fn, ...args) {
        try {
            return obj[fn](...args);
        } catch (e) {
            return undefined;
        }
    };
    return tryInvoke(Math, 'pow', 2, 3);
}

// log(withStatements())

function withObject() {
    // refactor to an arrow function
    const getObject = function (favoriteCandy) {
        return { favoriteCandy };
    };
    return getObject('twix');
}

// log(withObject())

function curryAdd() {
    // refactor to a arrow functions
    return curryAddition(9)(3)(5);

    function curryAddition(a) {
        return function (b) {
            return function (c) {
                return a + b + c;
            };
        };
    }
}

// log(curryAdd())

/*







SOLUTIONS ARE BELOW









 */

function multiArgumentSOLUTION() {
    const divide = (a, b) => a / b;
    return divide(40, 10);
}

// log(multiArgumentSOLUTION())

function noArgumentSOLUTION() {
    const getFive = () => 5;
    return getFive();
}

// log(noArgumentSOLUTION())

function singleArgumentSOLUTION() {
    const identity = i => i;
    return identity(350);
}

// log(singleArgumentSOLUTION())

function spreadWithArrowSOLUTION() {
    // refactor to an arrow function
    const asArray = (...args) => args;
    return asArray(1, 2, 3, 4);
}

// log(spreadWithArrowSOLUTION())

function withStatementsSOLUTION() {
    const tryInvoke = (obj, fn, ...args) => {
        try {
            return obj[fn](...args);
        } catch (e) {
            return undefined;
        }
    };
    return tryInvoke(Math, 'pow', 2, 3);
}

// log(withStatementsSOLUTION())

function withObjectSOLUTION() {
    // refactor to an arrow function
    const getObject = favoriteCandy => ({ favoriteCandy });
    return getObject('twix');
}

// log(withObjectSOLUTION())

function curryAddSOLUTION() {
    const curryAddition = a => b => c => a + b + c;
    return curryAddition(9)(3)(5);
}

// log(curryAddSOLUTION())