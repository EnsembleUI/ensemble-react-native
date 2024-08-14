# Ensemble Reactive Native Wrapper

React native wrapper of ensemble package

## Installation

```sh
npm install ensemble-react-native
```

## Usage


```js
import { openEnsembleApp } from 'ensemble-react-native';

// ...

<TouchableOpacity onPress={openEnsembleApp}>
    <Text>Go to Ensemble Screen</Text>
</TouchableOpacity>
```

## Test

Install dependency: `yarn install`

Build flutter files: `cd ensemble_app && flutter build aar --no-tree-shake-icons`

Move to main repo: `cd ..`

Run on android: `yarn example android`
