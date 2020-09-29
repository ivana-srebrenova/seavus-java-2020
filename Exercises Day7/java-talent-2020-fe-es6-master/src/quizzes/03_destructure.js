import log from './helpers/pretty-log';

function getAverage() {
    // refactor with object destructuring
    const obj = { x: 3.6, y: 7.8, z: 4.3 };
    return Math.floor((obj.x + obj.y + obj.z) / 3.0);
}

// log(getAverage())

function getFirstTwo() {
    // refactor with array destructuring
    const arr = [0, 1, 2, 3, 4, 5, 6, 7];
    const firstItem = arr[0];
    const secondItem = arr[1];

    return {
        firstItem: firstItem, // Can we improve this?
        secondItem: secondItem
    };
}

// log(getFirstTwo())

function defaultValues(bench) {
    const legCount = bench.legs === undefined ? getDefaultLegCount() : bench.legs;
    return legCount;

    function getDefaultLegCount() {
        return 4;
    }
}

// log(defaultValues({ type: 'Piano', adjustable: false }))

/*







SOLUTIONS ARE BELOW









 */

function getAverageSOLUTION() {
    const obj = { x: 3.6, y: 7.8, z: 4.3 };
    const { x, y, z } = obj;
    return Math.floor((x + y + z) / 3.0);
}

// log(getAverageSOLUTION())

function getFirstTwoSOLUTION() {
    const arr = [0, 1, 2, 3, 4, 5, 6, 7];
    const [first, second] = arr;

    return {
        first: first,
        second: second
    };
}

// log(getFirstTwoSOLUTION())

function defaultValuesSOLUTION(bench) {
    const { legs: legCount = getDefaultLegCount() } = bench;
    return legCount;

    function getDefaultLegCount() {
        return 4;
    }
}

// log(defaultValuesSOLUTION({ type: 'Piano', adjustable: false }))
